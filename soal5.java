import java.util.ArrayList;

public class soal5 {
    //tentukan hasil yang didapat jika dilakukan perintah 
    //remove(0),remove(3),remove(2)
public static void main(String[] args) {

ArrayList<String> nama = new ArrayList<String>();
nama.add("A");
nama.add("Y");
nama.add("A");
nama.add("H");
    
System.out.println("Array sebelum remove:");
for(String var: nama){
    System.out.println(var);
}

System.out.println("ArrayList setelah remove :");
    for(String var2: nama){
        System.out.println(var2);

        nama.remove(0);
        nama.remove(3);
        nama.remove(2);
    }
}
}
