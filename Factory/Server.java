import java.util.*;
public class Server implements Computer {

	private String ram;
	private String memory;
	private String cpu;
	
	public Server(String ram, String memory, String cpu){
		this.ram= ram;
		this.memory= memory;
		this.cpu= cpu;
	}
	public String getRAM() {
		return this.ram;
	}

	public String getMemory() {
		return this.memory;
	}

    public String getCPU() {
		return this.cpu;
	}
	public String add(){
		return "RAM: "+this.getRAM()+", Memory: "+this.getMemory()+", CPU: "+this.getCPU();
	}
	}
