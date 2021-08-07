package br.edu.ifpb.report.controller;

public abstract class Report {

    public void generate(){}

    public void createDatabaseConnection() {}

    public void executeMySQLQuery() {}

    public void convertToPDF() {}

    public void convertToXLS() {}

    public void executePostgresQuery() {}

}

