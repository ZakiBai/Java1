package cities;
import java.util.ArrayList;
import java.util.Comparator;
/**
 * @author Zaki Menzhanov(отличник)
 **/
public class Cities {
private static City City;
    
    public static void main(String[] args) {
        
    System.out.println("List of Cities: ");
    City city1 = new City();
    city1.setcityName("Astana");
    city1.setcityYear(1830);
    System.out.println(city1.getcityName());
    
    City city2 = new City();
    city2.setcityName("Almaty");
        city2.setcityYear(1854);
    System.out.println(city2.getcityName());
    
    City city3 = new City();
    city3.setcityName("Moscow");
        city3.setcityYear(1147);
    System.out.println(city3.getcityName());
    
    City city4 = new City();
    city4.setcityName("Saint-Petersburg");
        city4.setcityYear(1703);
    System.out.println(city4.getcityName());
    
    City city5 = new City();
    city5.setcityName("Amsterdam");
        city5.setcityYear(1275);
    System.out.println(city5.getcityName());
    
    City city6 = new City();
    city6.setcityName("Paris");
        city6.setcityYear(-1952);
    System.out.println(city6.getcityName());
    
    City city7 = new City();
    city7.setcityName("New York");
        city7.setcityYear(1624);
    System.out.println(city7.getcityName());
    
    City city8 = new City();
    city8.setcityName("Shimkent");
        city8.setcityYear(1992);
    System.out.println(city8.getcityName());

    City city9 = new City();
    city9.setcityName("Madrid");
        city9.setcityYear(1661);
    System.out.println(city9.getcityName());
    
    City city10 = new City();
    city10.setcityName("London");
        city10.setcityYear(43);
    System.out.println(city10.getcityName()+'\n');
    
    ArrayList<City> nTown = new ArrayList<City>();
     nTown.add(city1);
      nTown.add(city2);
        nTown.add(city3);
          nTown.add(city4);
            nTown.add(city5);
             nTown.add(city6);
              nTown.add(city7);
                nTown.add(city8);
                 nTown.add(city9);
                   nTown.add(city10);
    
    System.out.print("Size of my ArrayList: ");
    System.out.println(nTown.size()+"\n");
    
    System.out.println("ArrayList result list of Cities and years of foundation: ");
    for(int i=0; i<nTown.size(); i++){
      System.out.println(nTown.get(i).getcityName() + " " + "(" + nTown.get(i).getcityYear() + ")");
    }
    
    System.out.println("\n"+"List of Capitals: ");
    System.out.println(nTown.get(0).getcityName()+" (Kazakhstan)");
    System.out.println(nTown.get(2).getcityName()+" (Russia)");
    System.out.println(nTown.get(4).getcityName()+" (Niderlands)");
    System.out.println(nTown.get(5).getcityName()+" (France)");
    System.out.println(nTown.get(8).getcityName()+" (Spain)");
    System.out.println(nTown.get(9).getcityName()+" (England)" + "\n");
    
    System.out.println("List of Non-Capitals: ");
    System.out.println(nTown.get(1).getcityName());
    System.out.println(nTown.get(3).getcityName());
    System.out.println(nTown.get(6).getcityName());
    System.out.println(nTown.get(7).getcityName() + "\n");
    
    System.out.println("Boolean List of Cities(true or false) that contains letter -a- : ");
      String letter = "A";
    for(int i=0; i<nTown.size(); i++){
        System.out.println(nTown.get(i).getcityName().contains(letter.toLowerCase()));
       }
      
    System.out.println("\n"+"Equals(IngoreCase): ");
    System.out.println("alamty".equals(nTown.get(1).getcityName()));
    System.out.println("Astana".equals(nTown.get(0).getcityName()));
    System.out.println("Astana".equalsIgnoreCase(nTown.get(1).getcityName())+"\n");
    
    System.out.println("First 3 letters of ArrayList of Cities: ");
    for(int i=0; i<nTown.size(); i++){
        System.out.println(nTown.get(i).getcityName().substring(0,3));
    }
    System.out.println("\n"+"Sorting ArrayList using COMPARATOR by founded years:");
    
    nTown.sort(new Comparator<City>(){
        @Override
        public int compare(City city0, City city1){
            int city0cityYear = city0.getcityYear();
            int city1cityYear = city1.getcityYear();
            return (int)((city0cityYear - city1cityYear)*100);
        }
    }
    );
    
    
    for(int i=0; i<nTown.size(); i++){
        System.out.println(nTown.get(i).getcityName() + " " + "(" + nTown.get(i).getcityYear() + ")");
    }
    
    
    
    
    nTown.remove(city1);
    nTown.remove(city2);
    nTown.remove(city3);
    nTown.remove(city5);
    System.out.print("\n"+"Size of ArrayList after deleting: ");
    System.out.println(nTown.size()+"\n");
    
    System.out.println("ArrayList of Cities after deleting: ");
    for(int i=0; i<nTown.size(); i++){
      System.out.println(nTown.get(i).getcityName());
    }
}
}