package lang.example;

public class PkgTest {
    public static void main(String[] args) {
        Package[] pkgs;
        pkgs = Package.getPackages();
        for (int i=0; i<pkgs.length; i++){
           System.out.println(pkgs[i]);
        }
        Package pkg = Package.getPackage("java.io");
        Package pkg2 = PkgTest.class.getPackage();
        String svendor = pkg2.getSpecificationVendor();
        String sversion = pkg2.getSpecificationVersion();
        String stitle = pkg2.getSpecificationTitle();
        System.out.println("Package Name: " + pkg.getName());
        System.out.println("Package Name: " + pkg2.getName());
        System.out.println("Package Vendor: " + svendor);
        System.out.println("Package Version: " + svendor);
        System.out.println("Package Title: " + svendor);
    }
}

