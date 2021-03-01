package artifact;

import artifact.model.Artifact;

public class ArtifactRun {
    public static void main(String[] args) {
        Artifact a1 = new Artifact(1, "Atstec", -12);

        Artifact a2 = new Artifact(2, "Middle age", 10);

        Artifact a3 = new Artifact(3);

        a2.print();
        System.out.println();
        a1.print();
        System.out.println();
        a3.print();
    }
}
