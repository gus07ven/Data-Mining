public class Apriori {

    private int min_sup = 2;


    // Algorithm
    // C1 init-pass(T)
    // F1 {f | f E C, f.count/n >= minsup);  <-- # of transactions in T
    // for (k = 2, Fk-1 != null; k++) do
    //      Ck <- candidate-gen(Fk-1);
    //      for each transaction t E T do
    //          for each candidate c # Ck do
    //              if C is contained in t then
    //                  c.count++;
    //          end
    //      end
    //      Fk <-{ C E Ck|c.count/n >= minsup)
    // end
    // return F <- Uk Fk;


    // k number of items in the set
    public int[] algorithm(){
        int[] test = {0,0,0};
        // Step 1: Scan database for count of each candidate.

        //  1a Sort the class in total order
        // Step 2: Compare candidate support count with min
        // support count (50%)
        // Step 3: Generate candidate C2 from results of #2
        // Step 4: Scan D for count of each candidate in C2
        // and find the support
        // Step 5: Compare candidate C2 support count with the min
        // support count
        return test;
    }


    // Candidate generation function
//    public int[] candidateGeneration(){
//
//    }
}
