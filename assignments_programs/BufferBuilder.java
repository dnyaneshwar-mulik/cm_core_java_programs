package assignments_programs;

public class BufferBuilder {
	
	public static void main(String[] args) {
		
		StringBuffer stringBuffer = new StringBuffer("CodeMind "); 
		
		stringBuffer.append("Technology");
		
		System.out.println(stringBuffer);
		
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("CodeMind ");
		stringBuilder.append("Technology");
		
		System.out.println(stringBuilder);
	}

}
