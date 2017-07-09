package algorithm;
import java.util.*;
import java.io.*;
public class Graphna {
    private final int v;
    private final LinkedList<Integer> adj[];
    public ArrayList<String> grps=new ArrayList<>();
    public int result[];
    public ArrayList<Integer> chk=new ArrayList<>();
    public ArrayList <Integer> grp=new ArrayList<>();
    public ArrayList<Integer> al=new ArrayList<>();
   public int a[][];
    Random rno;
    ArrayList<Integer> getList()
    {
        return chk;
    }
    public Graphna(int v)
    {
        this.v=v;
        a=new int[5][4];
        adj=new LinkedList[v];
        for(int i=0;i<v;i++)
            adj[i]=new LinkedList();
        for(int i=0;i<14;i++)
            grp.add(i);
        grps.add("COE1"); grps.add("COE2"); grps.add("COE3"); grps.add("COE4"); grps.add("COE5"); grps.add("COE6"); grps.add("COE7"); grps.add("COE8"); 
        grps.add("COE9");grps.add("CML1");grps.add("CML2"); grps.add("CML3"); grps.add("CAG1"); grps.add("CAG2"); grps.add("SEM"); 
        for(int i=14;i<20;i++)
            grps.add("NULL");
        result = new int[v];
        for (int u = 0; u < v; u++)
            result[u] = -1;
        result[0]=0;
            }
    public void addEdge(int s,int d)
    {
        adj[s].add(d);
        adj[d].add(s);
    }
    public void color()
    {
        a=new int[5][14];
        boolean available[] = new boolean[v];
        for (int cr = 0; cr < v; cr++)
            available[cr] = false;
        for(int p=0;p<5;p++)
        {
            int c=0;
        Iterator itr=grp.iterator();
         for(int u=0;u<v;u++)
        {       
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
             a[p][c]=u;
             chk.add(result[u],p);
                if(c>3)
                break;
        }
        for (int u = 0,i; u <=3; u++)
            for(i=u;i<v;i++)
                if(result[i]!=-1)
                    break;
        }
    }
    public static void main(String args[])
    {
        Graphna g = new Graphna(20);
        for(int i=0;i<13;i++)
        {
            for(int j=i+1;j<14;j++)
                g.addEdge(i,j);
        }
        g.color();
        for(int i=0;i<14;i++)
           System.out.println(i+" "+g.chk.get(i));
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<4;j++)
                System.out.print(g.a[i][j]);
            System.out.println();
        }
    }
    
    
}
