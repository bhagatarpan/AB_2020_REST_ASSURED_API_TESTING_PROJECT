import org.testng.annotations.DataProvider;

public class DataForTest {

    @DataProvider(name = "dataprovider_dataforpost")
    public Object[][] dataForPost() {

//        Object [] [] data = new Object[2][3];

//        data [0][0]="Albert";
//        data [0][1]="Einsine";
//        data [0][2]=2;
//
//        data [1][0]="Thomas";
//        data [1][1]="Edison";
//        data [1][2]=1;
//
//        return data;

        return new Object[][]{
                {"Graham", "Bell", 1},
                {"Henry", "Ford", 2}

        };
    }

    @DataProvider(name = "dataproivder_datafordelete")
    public Object[] dataForDelete() {
        return new Object[]{
                8, 9
        };
    }

}
