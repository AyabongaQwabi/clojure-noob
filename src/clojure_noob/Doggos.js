const bothPass = (object) = (conditionFunc1, conditionFunc2) => {
    if(conditionFunc2 === null){
        return conditionFunc1(object);
    }
    const endResult1 = conditionFunc1(object);
    const endResult2 = conditionFunc2(object);
    return (endResult1 && endResult2);
}

const isDoggoType = bothPass(doggo)
const isTeenPupper = isDoggoType(isTeeny, isPupper)