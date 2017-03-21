package oop.inheritance;
public class HandphoneChild extends ClassHandphone{
    String menelfon;
    @Override
    public void tekanTombol(){
        System.out.println("ini tampilan dari sub kelas");
    }
    public void ClassHanphone(){
        tekanTombol();
        super.tekanTombol();
        System.out.println("Fungsi atau aksi pada Hp sub kelas;"+menelfon);
        System.out.println("Fungsi atau aksi pada Hp super kelas;"+super.menyala);
    }
    public static void main(String args[]){
        HandphoneChild obj=new HandphoneChild();
        obj.ClassHandphone();
    }
}
