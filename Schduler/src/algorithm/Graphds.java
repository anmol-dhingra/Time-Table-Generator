package algorithm;
import java.util.*;
import algorithm.Graphna;
import static java.util.Collections.copy;
public class Graphds
{
public int v;
public LinkedList<Integer> adj[];
int result[];
public ArrayList<Integer> grp;
public ArrayList<Integer> chk;
public Map<Integer,Integer> chkbug=new HashMap<Integer,Integer>();
public Map<Integer,Integer> lab1=new HashMap<Integer,Integer>();
public Map<Integer,Integer> lab2=new HashMap<Integer,Integer>();
Graphna na;
boolean[] bug;
Graphbug buggy;
public int[] arr;
Graphds(int v)
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
        arr=new int[v];
        
}
  void disp()
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
void addEdge(int s,int d)
    {
        adj[s].add(d);
        adj[d].add(s);
    }
void color()
{
boolean available[]=new boolean[v];
 for (int cr = 0; cr < v; cr++)
            available[cr] = false;
 int arr[][]=new int[14][2];
 for(int i=0;i<14;i++)
 {
     for(int j=0;j<2;j++)
       arr[i][j]=-1;  
 }
 int[] allocate=new int[14];
 
 

 for(int p=0;p<5;p++)
 {
     Iterator itr=na.grp.iterator();
     Iterator itr1=na.grp.iterator();   
     int c=1;  
 loop1: while(itr.hasNext()||itr1.hasNext())
     {
         int lab=0;
     while(lab<2)
     {
     int u=0,lno=0;
     if(itr.hasNext())
     {
         System.out.println("Itr");
     u=(int)itr.next();
     lno=1;
     }
     else if(itr1.hasNext())
     {
         System.out.println("Itr1");
         u=(int)itr1.next();
     lno=2;
     lab=(lab+1)%2;
     if(lab1.get(u)!=null)
     {
     break loop1;
     }
     }
     int k=chk.get(u);
     int l=chkbug.get(u);
     int h=0;
     for(int t=0;t<28;t++)
         if(result[t]>-1)
            h++;
     if(h==28)
         break;
       
     while(((k==p||l==p)&&result[u+14*(lno-1)]==-1)||result[u+14*(lno-1)]>-1)
     {
      if(itr.hasNext())
     {
     u=(int)itr.next();
     lno=1;
     }
      else if(itr1.hasNext())
     {u=(int)itr1.next();
     lno=2;
     }
     k=chk.get(u);
     l=chkbug.get(u);
     }
     System.out.println(u+" "+k+" "+l+" "+p+" "+lab%2);
     Iterator<Integer> it=adj[u].iterator();
     while(it.hasNext())
     {
     int i=it.next();
     if(result[i]!=-1)
     {
         available[result[i]]=true;
     }
     }
     int clr;
     for(clr=0;clr<v;clr++)
         if(available[clr]==false)
             break;
     c++;
    if(lab==0)
         lab1.put(u,p);
    else
        lab2.put(u,p);
   // System.out.println("lab1");
   // System.out.println(u+" "+lab1.get(u));
   // System.out.println("lab2");
   // System.out.println(u+" "+lab2.get(u));
    lab++;
    if(c>8)
        break loop1;
     } 
  } 
 }
}

 //{//System.out.println(i+" "+lab1.get(i));
  //   System.out.println(i+" "+lab2.get(i));}
    /*for(int b=0;b<4;b++)
    {
        int lab=0;
        while(lab<2)
        {
            Iterator itr=na.grp.iterator();
        while(itr.hasNext())
        {
            int u=(int)itr.next();
            int k=chk.get(u);
            int l=chkbug.get(u);
            while((k==p || l==p)&& result[u]==-1 || result[u]>-1)
            {
                u=(int)itr.next();
                k=chk.get(u);
                l=chkbug.get(u);
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
      for(int r=0;r<2;r++)
            if(arr[u][r]!=-1)
                arr[u][r]=p;
                lab++;
        }
        }
       
      */  
public static void main(String args[])
    {
        Graphds gd = new Graphds(20);
        for(int i=0;i<13;i++)
        {
            for(int j=i+1;j<14;j++)
                gd.addEdge(i,j);
        }
        gd.disp();
        gd.color();//System.out.println("f");
       // gd.print();
    }
}