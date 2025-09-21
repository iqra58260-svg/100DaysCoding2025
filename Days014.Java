package days14;
public class Days14 {

    public static void main(String[] args) {
      String data = "100";
      int dataInt = Integer.parseInt(data);
      byte dataByte = Byte.parseByte(data);
      short dataShort = Short.parseShort(data);
      long dataLong = Long.decode(data);
      
      float dataFloat = Float.parseFloat(data);
      double dataDouble = Double.valueOf(data);
        System.out.println("Integer\t\t:"+(dataInt+2));
        System.out.println("Byte\t\t:"+dataByte*5);
        System.out.println("Short\t\t:"+dataShort+263);
        System.out.println("Long\t\t:"+dataLong*142);
        System.out.println("Float\t\t:"+dataFloat*53);
        System.out.println("Double\t\t:"+dataDouble*28);
        
        
    }
    
}
