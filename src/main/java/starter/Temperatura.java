package starter;

public class Temperatura {
	
	private int temperaturaC;
	
	public Temperatura(int temperaturaC)
	{
		this.temperaturaC =temperaturaC;
	}
	
	public String mostrarTemperaturaC(int temperaturaC){
		return "Temperatura es: "+temperaturaC+"en Cº";
	}

	public String convertir(int temperaturaC)
	{
		int temperaturaF =(int) ((temperaturaC*1.8) +32);
		return "Temperatura en Fahrenheit : "+temperaturaF;
	}
	
	
	

}
