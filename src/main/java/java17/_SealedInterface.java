package java17;



public sealed interface _SealedInterface  permits A, B,C{
}

final class  A implements  _SealedInterface{

}

final class  B implements  _SealedInterface{


}

final class  C implements _SealedInterface{

}

//class  M implements  _SealedInterface{
//
//}