class marks{
    private int urdu;
    private int eng;
    private int isl;

    public marks (){
        System.out.println("this is no arg");
    }
    public marks (int u,int e,int i){
        this.eng=e;
        this.isl=i;
        this.urdu=u;
    }
    public void setUrdu(int u){
        this.urdu=u;
    }
    public void setEng(int e){
        this.eng=e;
    }
    public void setIsl(int i){
        this.isl=i;

    }
    public int geturdu (){
        return urdu;
    }
    public int getEng (){
        return eng;
    }
    public int getIsl(){
        return isl;
    }

}
class runner2{
    public static void main(String[] args) {
        marks m=new marks();
        marks N=new marks(33,44,66);
        m.setEng(66);
        m.setIsl(66);
        m.setUrdu(66);
        System.out.println("marks of urdu are "+ m.geturdu());
        System.out.println("marks of eng are "+ m.getEng());
        System.out.println("marks of isl are "+ m.getIsl());
    }
}
