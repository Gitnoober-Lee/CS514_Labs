package martian_genome_interface_lab;

/**
 * @Description:
 * @Title: MartianAnalyzer
 * @Package martian_genome
 * @Author: lijunpeng@cmhi.chinamobile.com
 * @CreateTime: 10/18/23 10:30 AM
 */
public class MartianAnalyzer {

    public static void main(String[] args) {
        // GenomeSeriesAnalyzer gsa = new GenomeSeriesAnalyzer(GenomeFilesIte.GENIUS);
        // GenomeSeriesAnalyzer gsa = new GenomeSeriesAnalyzer(GenomeFilesIte.REPEAT_SEQ);
        GenomeSeriesAnalyzer gsa = new GenomeSeriesAnalyzer(GenomeFilesIte.Gastro_Disease);
        gsa.run();

    }
}
