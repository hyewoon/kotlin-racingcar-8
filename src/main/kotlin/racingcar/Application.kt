package racingcar

import camp.nextstep.edu.missionutils.Console.readLine
import camp.nextstep.edu.missionutils.Randoms
import net.bytebuddy.pool.TypePool.Resolution.Illegal

fun main() {
    // TODO: 프로그램 구현
    println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)")
    val input = readLine()!!
    val carList: MutableList<String> = input.split(",").map { it.trim() }.toMutableList()

   //if(carList.filter{it.length > 5}.isNotEmpty()) throw IllegalArgumentException()
   // any(조건)조건에 만족하는 요소 하나라도 있으면 true반환
    if(carList.any{it.length > 5}) throw IllegalArgumentException("자동차이름은 5자 이하여야 합니다.")

    println("시도할 횟수는 몇 회인가요?")
    val inputNum = readLine()!!
    var count: Int = 0
    try{
        count = inputNum.toInt()
    }catch(e:Exception){
        throw IllegalArgumentException("숫자를 입력해주세요")
    }

    val carPositions = mutableListOf<String, Int>()
    //자동차 멤버 초기화
    for(name in carList){
        carPositions[name] = 0
    }

}






