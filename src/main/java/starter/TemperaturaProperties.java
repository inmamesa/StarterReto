package starter;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("temperaturaC.mensaje")
public class TemperaturaProperties {
	
	private int temperatura =25;

	public int getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}

	

}
