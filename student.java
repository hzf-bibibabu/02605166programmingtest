public class student {
    private String name;
    private String cid;
    private String type;
    private double indeprogrammingtest;
    private double aisoftware;
    private double designviva;
    private double realindepro;
    private double passininde;
    private double functionality;
    private double verification;
    private double deign;
    private double explan;

    public student(String cid,String name,String type){
        this.cid=cid;
        this.name=name;
        this.type=type;
    }

    public String getName() {
        return name;
    }

    public String getCid() {
        return cid;
    }

    public String getType() {
        return type;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getIndeprogrammingtest() {
        return indeprogrammingtest;
    }

    public void setIndeprogrammingtest(double indeprogrammingtest,double passit) {
        this.realindepro=indeprogrammingtest;
        this.passininde=passit;
        if(passit==1.0){
            this.indeprogrammingtest=indeprogrammingtest;
        }
        else{this.indeprogrammingtest=40.0;}
    }

    public double getAisoftware() {
        return aisoftware;
    }

    public void setAisoftware(double functionality,double verification) {
        this.functionality=functionality;
        this.verification=verification;
        this.aisoftware = 0.4*functionality+0.6*verification;
    }

    public void setDesignviva(double design,double explan) {
        this.explan=explan;
        this.deign=design;
        this.designviva=design*0.5+explan*0.5;

    }

    public double getDesignviva() {
        return designviva;
    }
    public double getTotalmark(){
        double Totalmark;
        if(this.type=="MSc"){
            Totalmark=this.indeprogrammingtest*0.25+this.aisoftware*0.45+this.designviva*0.3;
            return Totalmark;
        }
        else {
            Totalmark=this.indeprogrammingtest*0.3+this.aisoftware*0.7;
            return  Totalmark;
        }
    }

    public double getDeign() {
        return deign;
    }

    public double getExplan() {
        return explan;
    }

    public double getFunctionality() {
        return functionality;
    }

    public double getPassininde() {
        return passininde;
    }

    public double getRealindepro() {
        return realindepro;
    }

    public double getVerification() {
        return verification;
    }
}
