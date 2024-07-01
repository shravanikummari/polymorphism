public interface Employee1 {

        String name="shravani";
        String change();
}
class Developer implements Employee1 {
        @Override
        public String change(){
                return "wipro";
        }
        public static void main(String[] args) {
                Developer d=new Developer();

                System.out.println(d.change());
                System.out.println(Employee1.name);
        }

}

