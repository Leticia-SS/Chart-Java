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


        // GRÁFICO DE PARABOLA
//        XYSeries parabola = new XYSeries("y = x²");
//        for (int x = -10; x <= 10; x++){
//            parabola.add(x, x*x); // Fazer -(x*x) para mudar abertura da parábola
//        }                         // Para função constante coloque uma constante, seja em X ou Y
//
//        XYSeriesCollection dataset = new XYSeriesCollection();
//        dataset.addSeries(parabola);
//
//        JFreeChart chart = ChartFactory.createXYLineChart("Gráfico de Parabola f(x)=x²",
//                "X","Y",dataset);
//
//        JFrame frame = new JFrame("Gráfico de Parábola");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.add(new ChartPanel(chart));
//        frame.setSize(500,400);
//        frame.setLocationRelativeTo(null);
//        frame.setVisible(true);


        //GRÁFICO SENO E COSSENO
//        XYSeries parabola = new XYSeries("Seno");
//        for (double x = -10; x <= 10; x+=0.1){
//            parabola.add(x, Math.sin(x)); // Para cosseno Math.cos(x)
//        }
//
//        XYSeriesCollection dataset = new XYSeriesCollection();
//        dataset.addSeries(parabola);
//
//        JFreeChart chart = ChartFactory.createXYLineChart("Gráfico Seno",
//                "X","Y",dataset);
//
//        JFrame frame = new JFrame("Gráfico Seno");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.add(new ChartPanel(chart));
//        frame.setSize(600,600);
//        frame.setLocationRelativeTo(null);
//        frame.setVisible(true);


        // FUNÇÃO SIGMOIDE OU LOGÍSTICA
//        XYSeries parabola = new XYSeries("Sigmoide");
//        for (double x = -10; x <= 10; x+=0.1){
//            parabola.add(x, 1/(1+Math.pow(Math.E,-x)));
//        }
//
//        XYSeriesCollection dataset = new XYSeriesCollection();
//        dataset.addSeries(parabola);
//
//        JFreeChart chart = ChartFactory.createXYLineChart("Gráfico Sigmoide",
//                "X","Y",dataset);
//
//        JFrame frame = new JFrame("Gráfico Sigmoid");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.add(new ChartPanel(chart));
//        frame.setSize(600,600);
//        frame.setLocationRelativeTo(null);
//        frame.setVisible(true);



        // FUNÇÃO GAUSSIANA
        XYSeries parabola = new XYSeries("Gaussiana");
        for (double x = -10; x <= 10; x+=0.1){
            parabola.add(x, Math.pow(Math.E,-Math.pow(x,2)/2));
        }

        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(parabola);

        JFreeChart chart = ChartFactory.createXYLineChart("Gráfico Gaussiana",
                "X","Y",dataset);

        JFrame frame = new JFrame("Gráfico Guassiana");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new ChartPanel(chart));
        frame.setSize(600,600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);


    }
}