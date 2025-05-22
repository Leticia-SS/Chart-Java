package org.JavaWeb;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        // GRÁFICO BARRA
//        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
//        dataset.addValue(5,"Produtos","Janeiro");
//        dataset.addValue(8,"Produtos","Fevereiro");
//        dataset.addValue(3,"Produtos","Março");
//
//        JFreeChart chart = ChartFactory.createBarChart("Vendas Mensais",
//        "Mês","Unidades",dataset);
//        JFrame frame = new JFrame("Gráfico de Barras");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.add(new ChartPanel(chart));
//        frame.setSize(600,400);
//        frame.setLocationRelativeTo(null);
//        frame.setVisible(true);


        // GRÁFICO PIZZA
//        DefaultPieDataset dataset = new DefaultPieDataset();
//
//        dataset.setValue("Java",40);
//        dataset.setValue("Python",30);
//        dataset.setValue("JS",30);
//
//        JFreeChart chart = ChartFactory.createPieChart("Popularidade das Linguagens",
//                dataset, true, true, false);
//
//        JFrame frame = new JFrame("Gráfico de Pizza");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.add(new ChartPanel(chart));
//        frame.setSize(500,400);
//        frame.setLocationRelativeTo(null);
//        frame.setVisible(true);


        // GRÁFICO DE LINHA
//        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
//        dataset.addValue(1,"Temperatura","Seg");
//        dataset.addValue(2,"Temperatura","Ter");
//        dataset.addValue(3,"Temperatura","Qua");
//        dataset.addValue(4,"Temperatura","Qui");
//        dataset.addValue(5,"Temperatura","Sex");
//
//        JFreeChart chart = ChartFactory.createLineChart("Temperatura da Semana",
//                "Dia","ºC", dataset);
//
//        JFrame frame = new JFrame("Gráfico de Linha");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.add(new ChartPanel(chart));
//        frame.setSize(500,400);
//        frame.setLocationRelativeTo(null);
//        frame.setVisible(true);


        // GRÁFICO DE DISPERSÃO
//        XYSeries series = new XYSeries("Pontos");
//        series.add(1,2);
//        series.add(2,3);
//        series.add(3,2.5);
//        series.add(4,5);
//        series.add(5,4.5);
//
//        XYSeriesCollection dataset = new XYSeriesCollection(series);
//
//        JFreeChart chart = ChartFactory.createScatterPlot("Gráfico de dispersão",
//                "Eixo X", "Eixo Y", dataset);
//
//        JFrame frame = new JFrame("Gráfico de Dispersão");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.add(new ChartPanel(chart));
//        frame.setSize(500,400);
//        frame.setLocationRelativeTo(null);
//        frame.setVisible(true);


        // GRÁFICO DE ÁREA
//        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
//        dataset.addValue(3,"Valor","Jan");
//        dataset.addValue(4,"Valor","Fev");
//        dataset.addValue(2,"Valor","Mar");
//        dataset.addValue(5,"Valor","Abr");
//
//        JFreeChart chart = ChartFactory.createAreaChart("Consumo Mensal",
//                "Mês", "kWh", dataset);
//
//        JFrame frame = new JFrame("Gráfico de Área");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.add(new ChartPanel(chart));
//        frame.setSize(500,400);
//        frame.setLocationRelativeTo(null);
//        frame.setVisible(true);






    }
}