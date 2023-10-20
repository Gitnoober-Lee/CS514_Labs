package martian_genome_interface_lab;

public interface PatternDetector {

    int detect(GenomeAnalyzer analyzer);

    String labelString();

    String additionalInfo();
}
