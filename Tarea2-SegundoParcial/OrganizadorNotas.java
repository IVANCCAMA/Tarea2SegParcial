
public class OrganizadorNotas{
    private int numEst;
    private double [] notas;
    private int aux;
    private double promedioDeNotas;
    private double promedioDeNotasMayores;
    private int estReprobados;
    private int estAprobados;
    private double mayorNota;
    public OrganizadorNotas(int num){
        numEst = num;
        notas = new double[num];
        aux = 0;
        promedioDeNotas = 0;
        promedioDeNotasMayores = 0;
        estReprobados = 0;
        estAprobados = 0;
        mayorNota = 0;
    }
    
    public void AñadirNota(double nota){
        if(aux<notas.length){
            notas[aux] = nota;
            aux++;
        }
    }
    public double PromedioDeNot(){
        double promedio = 0;
        int total = 0;
        for(int i = 0; i<notas.length; i++){
            promedio = promedio + notas[i];
            total++;
        }
        promedioDeNotas = promedio/total;
        return promedioDeNotas;
    }
    public double PromedioDeNotMayores(){
        double promedio = 0;
        int total = 0;
        for(int i = 0; i<notas.length; i++){
            if(notas[i]>51){
                promedio = promedio + notas[i];
                total++;
            }
        }
        promedioDeNotasMayores = promedio/total;
        return promedioDeNotasMayores;
    }
    public int Reprobados(){
        for(int i = 0; i<notas.length; i++){
            if(notas[i]<51){
                estReprobados++;
            }
        }
        return estReprobados;
    }
    public int Aprobados(){
        for(int i = 0; i<notas.length; i++){
            if(notas[i]>=51){
                estAprobados++;
            }
        }
        return estAprobados;
    }
    public double MayorNota(){
        for(int i = 0; i<notas.length; i++){
            if(notas[i] > mayorNota){
                mayorNota = notas[i];
            }    
        }
        return mayorNota;
    }
}
