package algorithm;
import java.util.*;
public class dsalloc {
public int v;
public LinkedList<Integer> adj[];
int result[];
public ArrayList<Integer> grp;
public ArrayList<Integer> chk;
public Map<Integer,Integer> chkbug=new HashMap<>();
public Map<Integer,Integer> lab1=new HashMap<>();
public Map<Integer,Integer> lab2=new HashMap<>();
Graphna na;
boolean[] bug;
Graphbug buggy;
public int[][] arr;
    public dsalloc(int v)
    {
         this.v=v;
        adj=new LinkedList[v];
        for(int i=0;i<v;i++)
            adj[i]=new LinkedList();
        result = new int[28];
        for (int u = 0; u <28; u++)
            result[u] = -1;
        chk=new ArrayList<>();
        buggy=new Graphbug(v);
         na=new Graphna(v);
        na.color();
        buggy.disp();
        buggy.color();
        bug=new boolean[20];
        for(int x=0;x<20;x++)
            bug[x]=false;
        arr=new int[14][2];
        for(int i=0;i<14;i++)
            for(int j=0;j<2;j++)
                arr[i][j]=-5;
    }
     public void disp()
    {
        for(int i=0,k,l;i<14;i++)
         {
            k=na.getList().get(i);
            l=buggy.getList().get(i);
            k=4-k;
           chk.add(k);
           chkbug.put(i,l);
         }
    }
     public void addEdge(int s,int d)
    {
        adj[s].add(d);
        adj[d].add(s);
    }
    public  void color()
     {
        boolean available[]=new boolean[v];
        for (int cr = 0; cr < v; cr++)
            available[cr] = false;
        for(int p=0;p<5;p++)
        {
            Iterator itr=na.grp.iterator();
            for(int b=0;b<4;b++)
            {
            
                int lab=0;
                        int c=0;
                       loop1: while(itr.hasNext())
                        {
                            int u=(int)itr.next();
                        int k=chk.get(u);
                        int l=chkbug.get(u);
                        while((k==p||l==p)||(arr[u][0]==p-1 && arr[u][1]==-5)  || (arr[u][1]==p-1&&arr[u][0]==-5) ||(arr[u][1]!=-5&&arr[u][0]!=-5))
                        {
                            if(itr.hasNext())
                            {
                            	
                            u=(int)itr.next();
                            k=chk.get(u);
                            l=chkbug.get(u);
                            }
                            else
                            	break loop1;
                        }
                         Iterator<Integer> it=adj[u].iterator();
                         while(it.hasNext())
                         {
                          int i=it.next();
                          if(result[i]!=-1)
                          available[i]=true;
                         }
                         int clr;
                          for(clr=0;clr<v;clr++)
                         if(available[clr]==false)
                            break;
                          result[u]=clr;
                          if(arr[u][c]==-5)
                        	  arr[u][c]=p;
                          else
                        	  arr[u][(c+1)%2]=p;
                              c++;
                          if(c==2)
                              break;
                        }
            }
            int c=0;
            for(int i=0;i<14;i++)
                if(result[i]!=-1)
                    c++;
            if(c==14)
            {
              for(int i=0;i<14;i++)
                  result[i]=-1;
            }
        }
     }
     public static void main(String args[])
    {
        dsalloc gd = new dsalloc(20);
        for(int i=0;i<13;i++)
        {
            for(int j=i+1;j<14;j++)
                gd.addEdge(i,j);
        }
        gd.disp();
        gd.color();
    }
}