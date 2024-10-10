namespace my.bookshop;

entity Books {
  key ID : Integer;
  @emoji
  title  : localized String;
  stock  : Integer;
}