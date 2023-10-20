package martian_genome_interface_lab;


import java.util.ArrayList;
import java.util.List;

public class GenomeSeriesAnalyzer extends GenomeAnalyzer{

    private List<PatternDetector> listOfDetector;

    /**
     * just get the input
     *
     * @param fileName
     */
    public GenomeSeriesAnalyzer(String fileName) {
        super(fileName);
        listOfDetector = new ArrayList<>();
        addDetector(new GeniusDector());
        addDetector(new RepeaterDetector(5, "G"));
        addDetector(new GastroDiseaseDetector());
    }

    public void addDetector(PatternDetector pd){
        listOfDetector.add(pd);
    }

    public void run(){
        for (PatternDetector detector : listOfDetector){
            int ret = detector.detect(this);
            if (ret != -1){
                System.out.println(detector.labelString() + " detected at " + ret);
            } else {
                System.out.println(detector.labelString() + " not detected");
            }
            System.out.println(detector.additionalInfo());
        }
    }
}
