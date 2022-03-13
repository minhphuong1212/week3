// Chương trình Java để triển khai ngăn xếp
// sử dụng aray một chiều

lớp  Stack_array {
    int [] stck =  new  int [ 10 ];
    int tos;

    // Khởi tạo đầu ngăn xếp
    Stack_array () {
        tos =  - 1 ;
    }

    // Đẩy một mục vào ngăn xếp
    void  push ( int  item ) {
        if (tos ==  9 )
        Hệ thống . ra ngoài . println ( " ngăn xếp đã đầy. " );
        khác
        stck [ ++ tos] = item;
    }

    // bật một mục từ ngăn xếp
    int  pop () {
        if (tos <  0 ) {
            Hệ thống . ra ngoài . println ( " Ngăn xếp dòng dưới. " );
            trả về  0 ;
        }
        khác {
            return stck [tos - ];
        }
    }
    public  static  void  main ( String [] args ) {
        Stack_array mystack1 =  new  Stack_array ();
        Stack_array mystack2 =  new  Stack_array ();

        // đẩy một số số lên ngăn xếp
        for ( int i =  0 ; i <  10 ; i ++ ) mystack1 . thành thật);
        for ( int i =  10 ; i <  20 ; i ++ ) mystack2 . thành thật);

        // bật các số đó ra khỏi ngăn xếp
        Hệ thống . ra ngoài . println ( " Ngăn xếp trong mystack1: " );
        for ( int i =  0 ; i <  10 ; i ++ )
            Hệ thống . ra ngoài . println (mystack1 . pop ());
        Hệ thống . ra ngoài . println ( " Ngăn xếp trong mystack2: " );
        for ( int i =  0 ; i <  10 ; i ++ )
            Hệ thống . ra ngoài . println (mystack2 . pop ());
    }
}
