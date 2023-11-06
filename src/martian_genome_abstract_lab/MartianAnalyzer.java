package martian_genome_abstract_lab;


import martian_genome_interface_lab.GenomeFilesIte;
import martian_genome_interface_lab.GenomeSeriesAnalyzer;

public class MartianAnalyzer {

    public static void main(String[] args) {
        GenomeSeriesAnalyzer gsa = new GenomeSeriesAnalyzer(GenomeFilesIte.Gastro_Disease);
        gsa.run();
    }
}
