package basicLessons;

public class primitiveData {
    public static void main(String[] args) {

        // бинарная система счиcления
        byte b1 = 0b1100;
        // 8-ричная система счиcления
        byte b2 = 0_14;
        // 10-ричная система счиcления
        byte b3 = 12;
        // 16-ричная система счиcления
        byte b4 = 0xC;
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);

        // бинарная система счиcления
        short c1 = 0b101_0001_0100;
        // 8-ричная система счиcления
        short c2 = 02_424;
        // 10-ричная система счиcления
        short c3 = 1300;
        // 16-ричная система счиcления
        short c4 = 0x514;
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);

        // бинарная система счиcления
        int d1 = 0b0;
        // 8-ричная система счиcления
        int d2 = 00;
        // 10-ричная система счиcления
        int d3 = 0;
        // 16-ричная система счиcления
        int d4 = 0x0;
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);

        // бинарная система счиcления
        long  e1 = 0b111_0101_1011_1100_1101_0001_0101l;
        // 8-ричная система счиcления
        long  e2 = 0726_746_425l;
        // 10-ричная система счиcления
        long  e3 = 123456789l;
        // 16-ричная система счиcления
        long  e4 = 0x75B_CD15l;
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(e4);

        float a1 = 21.21f;
        float a2 = 22.22f;

        System.out.println(a1);
        System.out.println(a2);

        double a3 = 21.21;
        double a4 = 22.22;

        System.out.println(a3);
        System.out.println(a4);

        boolean bool1 = true;
        boolean bool2 = false;

        System.out.println(bool1);
        System.out.println(bool2);

        char a5 = 'ሴ';
        // 10-ричная система счиcления записи char
        char a6 = 4660;
        // 16-ричная система счиcления записи char
        char a7 = '\u1234';


        System.out.println(a5);
        System.out.println(a6);
        System.out.println(a7);


    }
}
