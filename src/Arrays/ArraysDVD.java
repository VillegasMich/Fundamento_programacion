package Arrays;

public class ArraysDVD {
    public static void main(String[] args) {
        DVD[] dvdcollection = new DVD[15];
        DVD avengerDVD = new DVD("The Avengers", 2012, "Joss Whedon");
        dvdcollection[7] = avengerDVD; // avengersDVD at index 8

        DVD incrediblesDVD = new DVD("The Incredibles", 2004, "Brad Bird");
        DVD findingDoryDVD = new DVD("Finding Dory", 2016, "Andrew Stanton");
        DVD lionKingDVD = new DVD("The Lion King", 2019, "Jon Favreau");

        dvdcollection[3] = incrediblesDVD;
        dvdcollection[9] = findingDoryDVD;
        dvdcollection[2] = lionKingDVD;

        DVD starWarsDVD = new DVD("Star Wars", 1977, "George Lucas");
        dvdcollection[3] = starWarsDVD; // Overwriting

        System.out.println(dvdcollection[7]);
        System.out.println(dvdcollection[10]);
        System.out.println(dvdcollection[3]);

        int capacity = dvdcollection.length;
        System.out.println("The Array has a capacity of " + capacity);
    }
}

class DVD {
    public String name;
    public int releasedYear;
    public String director;

    public DVD(String name, int releasedYear, String director) {
        this.name = name;
        this.releasedYear = releasedYear;
        this.director = director;
    }

    public String toString() {
        return this.name + ", directed by " + this.director + ", released in " + this.releasedYear;
    }
}


