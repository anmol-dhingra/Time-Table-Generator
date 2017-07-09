package algorithm;
import java.util.*;
import static java.util.Collections.copy;
public class Graphbug {
    private final int v;
    private final LinkedList<Integer> adj[];
    int result[];
    public ArrayList<Integer> grp;
   public Map<Integer,Integer> chkbug=new HashMap<>();
    Graphna na;
    public ArrayList<Integer> chk;
    public int arr[];
    boolean bug[];
   public Graphbug(int v)
    {
        this.v=v;
        adj=new LinkedList[v];
        for(int i=0;i<v;i++)
            adj[i]=new LinkedList();
        result = new int[v];
        for (int u = 0; u < v; u++)
            result[u] = -1;
        chk=new ArrayList<>();
        na=new Graphna(v);
        na.color();
        bug=new boolean[20];
        for(int x=0;x<20;x++)
            bug[x]=false;
        arr=new int[v];
    }
    HashMap<Integer,Integer> getList()
    {
        return (HashMap<Integer, Integer>) chkbug;
    }
   public  void disp()
    {
         for(int i=0,k;i<14;i++)
         {
            k=na.getList().get(i);
            k=4-k;
            chk.add(k);
         }
    }
    public void addEdge(int s,int d)
    {
        adj[s].add(d);
        adj[d].add(s);
    }
    public void color()
    {
      boolean available[] = new boolean[v];
        for (int cr = 0; cr < v; cr++)
            available[cr] = false;
        for(int p=4;p>=0;p--)
        {
            int c=0;
        Iterator itr=na.grp.iterator();
        while(itr.hasNext())
        {
           int u=(int)itr.next();
           int k=chk.get(u);
          int h=0;
          for(int t=0;t<14;t++)
          if(result[t]>-1)
              h++;
          if(h==14)
              break;
           while((k==p && result[u]==-1) || (result[u]>-1))
            {
               if(itr.hasNext())
               { u=(int)itr.next();
               k=chk.get(u);}
            }
            Iterator<Integer> it = adj[u].iterator() ;
            while (it.hasNext())
            {
                int i = it.next();
                if (result[i] != -1)
                    available[result[i]] = true;
            }
             int clr;
            for (clr = 0; clr <v; clr++)
              if (available[clr] == false)
                    break;
            c++; 
            result[u] = clr; 
             chkbug.put(u,p);
                if(c>3)
                break;
        }
         for(int x=0;x<4;x++)
        for(int i=0;i<v;i++)
           if(result[i]!=-1 && !bug[i]) 
            bug[i]=true; 
        }
    }
    void print()
    {
         for(int i=0;i<14;i++)
            System.out.println(na.grp.get(i)+" "+chkbug.get(i)+" ");
    }
    public static void main(String args[])
    {
        Graphbug gk = new Graphbug(20);
        for(int i=0;i<13;i++)
        {
            for(int j=i+1;j<14;j++)
                gk.addEdge(i,j);
        }
        gk.disp();
        gk.color();
    }
}
