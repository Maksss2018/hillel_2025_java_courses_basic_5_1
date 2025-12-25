void main() {
    Scanner scanner = new Scanner(System.in); // Create a Scanner object
    System.out.print("Please indicate the amount earned in the past quarter: ");
    var earnedSum = Double.parseDouble(scanner.nextLine());
    var taxesNumber =  switch (earnedSum) {
     case 0.0 < earnedSum && earnedSum <= 1000.0 -> 0.025;
     case 1000.0 < earnedSum && earnedSum <= 25000.0  -> 0.043;
     case 25000.0 < earnedSum -> 0.067;
        default -> 0.0;
 };
  /*  double taxesNumber = 0.0;
    if(0.0 < earnedSum && earnedSum <= 1000.0){
        taxesNumber = 0.025;
    } else if (1000.0 < earnedSum && earnedSum <= 25000.0) {
        taxesNumber = 0.043;
    } else if (25000.0 < earnedSum) {
        taxesNumber = 0.067;
    }
*/
    double actualTaxes = (earnedSum/100)* taxesNumber;



    String templateForOutPut = """
        earned in the past quarter is %.2f ;
        taxes is: %.2f%%
        the amount you owe: %.2f
        """;

       System.out.printf(templateForOutPut,
               earnedSum,
               taxesNumber*100,
               actualTaxes
       );

}
