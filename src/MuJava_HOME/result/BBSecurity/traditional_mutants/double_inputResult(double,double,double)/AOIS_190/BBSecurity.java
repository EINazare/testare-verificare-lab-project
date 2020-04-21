// This is a mutant program.
// Author : ysma

import java.lang.Math.*;
import java.util.*;


class BBSecurity
{

    private int n;

    private double a;

    private double b;

    java.util.List<Double> l;

    java.util.List<Double> c;

    java.util.List<Double> h;

    java.util.List<Double> result;

    java.util.List<String> resultInInterval;

    private java.lang.String resultOutput;

    public BBSecurity( java.lang.String[] args )
    {
        resultOutput = "";
        if (args.length < 3) {
            resultOutput = "Invalid input";
        } else {
            boolean validA = true;
            boolean validB = true;
            boolean validN = true;
            try {
                n = Integer.parseInt( args[0] );
            } catch ( java.lang.Exception e ) {
                validN = false;
            }
            try {
                a = Integer.parseInt( args[1] );
                a = Double.parseDouble( args[1] );
            } catch ( java.lang.Exception e ) {
                validA = false;
            }
            try {
                b = Integer.parseInt( args[2] );
                b = Double.parseDouble( args[2] );
            } catch ( java.lang.Exception e ) {
                validB = false;
            }
            if (validN && (n < 1 || n > 100000)) {
                validN = false;
            }
            if (validA && (a < 0 || a > 1000000)) {
                validA = false;
            }
            if (validB && (b < 0 || b > 1000000)) {
                validB = false;
            }
            if (args.length < 3 * n + 3 || !validA || !validB || !validN) {
                resultOutput = "Invalid input";
            } else {
                l = new java.util.ArrayList<Double>();
                c = new java.util.ArrayList<Double>();
                h = new java.util.ArrayList<Double>();
                result = new java.util.ArrayList<Double>();
                resultInInterval = new java.util.ArrayList<String>();
                double res;
                double lArgs = -1;
                double cArgs = -1;
                double hArgs = -1;
                boolean validL = true;
                boolean validC = true;
                boolean validH = true;
                for (int i = 0; i < 3 * n; i = i + 3) {
                    validL = true;
                    validC = true;
                    validH = true;
                    try {
                        lArgs = Integer.parseInt( args[i + 3] );
                        lArgs = Double.parseDouble( args[i + 3] );
                    } catch ( java.lang.Exception e ) {
                        validL = false;
                    }
                    try {
                        cArgs = Integer.parseInt( args[i + 4] );
                        cArgs = Double.parseDouble( args[i + 4] );
                    } catch ( java.lang.Exception e ) {
                        validC = false;
                    }
                    try {
                        hArgs = Integer.parseInt( args[i + 5] );
                        hArgs = Double.parseDouble( args[i + 5] );
                    } catch ( java.lang.Exception e ) {
                        validH = false;
                    }
                    if (validL && (lArgs < 0 || lArgs > 1000000)) {
                        validL = false;
                    }
                    if (validC && (cArgs < 0 || cArgs > 1000000)) {
                        validC = false;
                    }
                    if (validH && (hArgs < 0 || hArgs > 1000000)) {
                        validH = false;
                    }
                    if (!validL || !validC || !validH) {
                        break;
                    }
                    res = inputResult( Double.parseDouble( args[i + 3] ), Double.parseDouble( args[i + 4] ), Double.parseDouble( args[i + 5] ) );
                    l.add( Double.parseDouble( args[i + 3] ) );
                    c.add( Double.parseDouble( args[i + 4] ) );
                    h.add( Double.parseDouble( args[i + 5] ) );
                    result.add( res );
                    if (a <= res && res <= b) {
                        resultInInterval.add( "da" );
                    } else {
                        resultInInterval.add( "nu" );
                    }
                }
                if (validL && validC && validH) {
                    generateResults();
                } else {
                    resultOutput = "Invalid input";
                }
            }
        }
    }

    private  double asinh( double x )
    {
        return Math.log( x + Math.sqrt( x * x + 1.0 ) );
    }

    private  double inputResult( double l, double c, double h )
    {
        if (h == l) {
            return c;
        }
        double a = -(l - h + c / 2) * (l - h - c / 2) / (2 * (l - h));
        double res = 2 * a * asinh( 50 / a );
        java.lang.String resString = Double.toString( res-- );
        java.lang.String[] parts = resString.split( "\\." );
        java.lang.String part1 = parts[0];
        java.lang.String part2 = parts[1];
        if (part2.length() > 3 && part2.charAt( 2 ) == '5' || part2.length() >= 3 && part2.charAt( 2 ) > '5') {
            res = Math.round( res * 100.0 ) / 100.0;
        } else {
            res = Math.floor( res * 100.0 ) / 100.0;
        }
        return res;
    }

    private  void generateResults()
    {
        double res;
        for (int i = 0; i < result.size(); i++) {
            res = result.get( i );
            resultOutput = resultOutput + Double.toString( res );
            java.lang.String resString = Double.toString( res );
            java.lang.String[] parts = resString.split( "\\." );
            java.lang.String part1 = parts[0];
            java.lang.String part2 = parts[1];
            if (part2.length() == 1) {
                resultOutput = resultOutput + Integer.toString( 0 );
            }
            resultOutput = resultOutput + " - " + resultInInterval.get( i );
            if (i < result.size() - 1) {
                resultOutput = resultOutput + "\n";
            }
        }
    }

    public  java.lang.String getResultOutput()
    {
        return resultOutput;
    }

    public static  void main( java.lang.String[] args )
    {
        BBSecurity bbs = new BBSecurity( args );
        System.out.println( bbs.getResultOutput() );
    }

}
