package it.unisa.quiz;

public class Quiz implements Measurable {

    private final double score;

    public Quiz(double score) {
        this.score = score;
    }

    @Override
    public double getMeasure() {return score;}

    @Override
    public int compareTo(Measurable q)
    {
        if(score < q.getMeasure()) return -1;
        if(score == q.getMeasure()) return 0;
        return 1;
    }
}
