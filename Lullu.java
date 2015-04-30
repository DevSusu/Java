public class Lullu {

  public menu[] anju = [
    "삼겹살",
    "비앤나",
    "치즈케이크"
  ];

  public price[] gaguek = [
    3000,
    2000,
    3000
  ];

  public menu getAnju( int whatAnju, int price ) {
    return gaguek[whatAnju] ? menu[whatAnju] : price;
  }

}