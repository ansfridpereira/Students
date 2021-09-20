class marks{
    double PCPF;
    double PCOM;
    double AM3;
    double JAVA;
    double CP;

    double avg(){
        return (PCPF + PCOM + AM3 + JAVA + CP)/5;
    }
    marks (double a, double b,double c,double d,double e){
        PCPF = a;
        PCOM = b;
        AM3 = c;
        JAVA = d;
        CP = e;
    }
}