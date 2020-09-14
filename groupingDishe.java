import java.util.*;

public class groupingDishe {
    String[][] groupingDishes (String[][]dishes){
        Map<String, Set<String>> m=new HashMap<>();
        for (int i=0;i<dishes.length;i++){
            for (int j=1;j<dishes[i].length;j++){
                Set<String>st=m.getOrDefault(dishes[i][j],new HashSet<>());
                st.add(dishes[i][0]);
                m.put(dishes[i][j],st);

            }
        }

        List<String[]> lst=new ArrayList<>();
        for (int i=0;i<m.size();i++){
            Object[] l=  m.get( m.keySet().toArray()[i]).toArray();
            if(l.length>1){Arrays.sort(l);
                String d[]=new  String[l.length+1];
                d[0]= (String) m.keySet().toArray()[i];
                for (int j=0;j<l.length;j++){
                    d[j+1]= (String)l[j];
                }
                lst.add(d);
            }}
        Collections.sort(lst,(a,b)->a[0].compareTo(b[0]));
        return lst.toArray(new String[0][]);
    }
}
