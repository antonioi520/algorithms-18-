package part1;

public class Hash {
	String[][] data = {
			{"Gary Smith", "GarySmith@neit.edu","15.00"},
			{"Laila Kerniech", "LailaKerniech@neit.edu", "30.00"},
			{"Shawn Kemp", "ShawnKemp@neit.edu", "23.50"},
			{"Sarah Palin", "SarahPalin@neit.edu", "110.00"},
			{"Ray Connif", "RayConnif@neit.edu", "0.00"},
			{"Edmund Cortis", "EdmundCortis@neit.edu", "50.00"},
			{"John Matis", "JohnMatis@neit.edu", "15.00"},
	};
	
	public int sequential(String playerName){
		int i;
		for (i=0; i < data.length; i++){
			if(playerName.equalsIgnoreCase(data[i][0])){
				break;
			}
		}
		if (i>data.length){
			i = -1;
		} else{
			System.out.println("Player Name " + playerName + " found at index " + i + " after " + (i+1) + " reads");
		}
		return i;
	}
	
	public String displayRecord(int index){
		return "Record = "
				+ data[index][0]
				+", "
				+ data[index][1]
				+", "
				+ data[index][2];
	}
	
	public static void main(String[] args){
		Hash hash = new Hash();
		int rowFound =  hash.sequential("Sarah Palin");
		System.out.println(hash.displayRecord(rowFound));
	}
}
