public class TriangleClassifier {
    public static String classifier(int a,int b,int c){

        if (a==0||b==0||c==0){
            return "Không Phải Tam Giác";
        }

        if (a==b&&b==c){
            return "Tam Giác Đều";
        }

        if(a==b||b==c||c==a){
            return "Tam Giác Cân";
        }

        if (a+b<c||b+c<a||c+a<b){
                return "Không Phải Tam Giác";
        }

        return "Tam Giác Thường";
    }
}
