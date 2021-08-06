package br.edu.ifpb.report.service;

import br.edu.ifpb.report.controller.ExpenseReport;
import br.edu.ifpb.report.controller.TaxReport;

public class ReportService {

    ExpenseReport expenseReport = new ExpenseReport();
    TaxReport taxReport = new TaxReport();

    class expense extends ReportService{

        public void generateExpenseReport(String type){
            expenseReport.generate();
        }

    }

    class tax extends ReportService{

        public void taxExpenseReport(String type){
            taxReport.generate();
        }
    }

}
