package monocle.std

import monocle.PrismLaws
import monocle.TestUtil._
import org.specs2.scalaz.Spec

class EitherSpec extends Spec {

  checkAll("std left" , PrismLaws(stdLeft[Int, String, Int]))
  checkAll("std right", PrismLaws(stdRight[Int, String, String]))

}
