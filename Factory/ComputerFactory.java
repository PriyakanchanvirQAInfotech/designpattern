import java.util.*;
public class ComputerFactory {
		public static Computer getComputer(String type, String ram, String memory, String cpu){
			if("PC".equalsIgnoreCase(type)) 
				return new PC(ram, memory, cpu);
			else if("Server".equalsIgnoreCase(type)) 
				return new Server(ram, memory, cpu);
			return null;
		}
		public static void main(String[] args) {
			Computer pc = ComputerFactory.getComputer("pc","4 GB","700 GB","3.2 GHz");
			Computer server = ComputerFactory.getComputer("server","3 GB","500 GB","2.7 GHz");
			System.out.println("PC Config = "+pc.add());
			System.out.println("Server Config = "+server.add());
		}
}
