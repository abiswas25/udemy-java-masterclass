
public class DiagonalStar {

	public static void printSquareStar(int number) {
		if (number < 5) {
			System.out.println("Invalid Value");
		} else {
			int rowCount = number;
			int columnCount = number;
			int currentRow = 0;
			int currentColumn = 0;

			for (currentRow = 1; currentRow <= rowCount; currentRow++) {
				for (currentColumn = 1; currentColumn <= columnCount; currentColumn++) {

					if (currentRow == 1 || currentRow == rowCount || currentColumn == 1
							|| currentColumn == columnCount || currentRow == currentColumn
							|| (currentColumn == (rowCount - currentRow) + 1)) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}

				}
				System.out.println();
			}
		}
	}

}
