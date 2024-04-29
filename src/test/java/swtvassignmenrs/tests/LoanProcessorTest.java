package swtvassignmenrs.tests;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.LoanProcessor;
import org.junit.jupiter.api.Test;

public class LoanProcessorTest {
    @Test
    public void testLoanApprovalWithGoodCreditScore() {
        LoanProcessor loanProcessor = new LoanProcessor();
        String result = loanProcessor.processLoanApplication(700, true, 30000);
        assertEquals("Approved", result);
    }

    @Test
    public void testLoanRejectionDueToLowCreditScore() {
        LoanProcessor loanProcessor = new LoanProcessor();
        String result = loanProcessor.processLoanApplication(500, true, 30000);
        assertEquals("Rejected: Credit score too low", result);
    }

    @Test
    public void testLoanRejectionDueToUnemployment() {
        LoanProcessor loanProcessor = new LoanProcessor();
        String result = loanProcessor.processLoanApplication(750, false, 30000);
        assertEquals("Rejected: Applicant must be employed", result);
    }

    @Test
    public void testLoanRejectionDueToHighLoanAmount() {
        LoanProcessor loanProcessor = new LoanProcessor();
        String result = loanProcessor.processLoanApplication(750, true, 75000);
        assertEquals("Rejected: Loan amount too high", result);
    }
}
