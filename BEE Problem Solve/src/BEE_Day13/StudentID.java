package BEE_Day13;

public class StudentID {
    String Name;
    String Fathername;
    String Mothername;
    int     Roll;
    int     Rag;
    String Department;
    String Semister;
    String Session;
    double Cgpa;
    String institute;


    public StudentID(String N, String F, String M,int r,int R,String D,String S,String s,double C,String I) {
        Name = N;
        Fathername = F;
        Mothername = M;
        Roll = r;
        Rag = R;
        Department = D;
        Semister = S;
        Session = s;
        Cgpa = C;
        institute=I;
    }
    public void Student(){

        System.out.println(" Student Name  :"  +Name+" \n Father Name   :"+Fathername+"\n Mother Nmae   :"+Mothername+"\n Roll          :"+Roll+"\n Rag       \t   :"+Rag+"\n Department    :"+Department+"\n Semister      :"+Semister+
                "\n Session \t   :"+Session+"\n CGPA     \t   :"+Cgpa+"\n institute     :"+institute+"\n--------------------------\n--------------------------");
    }
}
