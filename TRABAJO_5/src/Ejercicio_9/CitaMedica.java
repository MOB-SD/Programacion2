package Ejercicio_9;

class CitaMedica{
    public String fecha,hora;
    public Paciente paciente;
    public Profesional profesional;

    public CitaMedica(String f,String h,Paciente p,Profesional prof){
        this.fecha=f;
        this.hora=h;
        this.paciente=p;
        this.profesional=prof;
    }
}