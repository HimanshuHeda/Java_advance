class emp{
    int eid;
    int sal;
    static String ceo;

    void disp(){
        System.out.println("Employee ID: "+eid+"\nSalary: "+sal+"\nCEO: "+ceo+"\n");
    }
}

public class sta_var {
    public static void main(String[] args) {
        emp e1=new emp();

        emp.ceo="Himanshu";

        e1.eid=101;
        e1.sal=3000;
        e1.disp();

        emp e2=new emp();

        emp.ceo="Harsh";

        e2.eid=102;
        e2.sal=5000;
        e2.disp();
    }
}
