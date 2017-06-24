package com.javarush.test.level13.lesson11.bonus03;

public class Robot extends AbstractRobot
{

    private String name;

    public Robot(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

}


//public class Robot implements Attackable, Defensable
//{
//    private static int hitCount;
//    private String name;
//
//    public Robot(String name)
//    {
//        this.name = name;
//    }
//
//    public String getName()
//    {
//        return name;
//    }
//    public BodyPart attack()
//
//        BodyPart attackedBodyPart = null;
//        hitCount = hitCount + 1;
//
//        if (hitCount == 1)
//        {
//        attackedBodyPart = BodyPart.LEG;
//        } else if (hitCount == 2)
//        {
//        attackedBodyPart = BodyPart.ARM;
//        } else if (hitCount == 3)
//        {
//        hitCount = 0;
//        attackedBodyPart = BodyPart.HEAD;
//        }
//        return attackedBodyPart;
//        }
//
//public BodyPart defense()
//        {
//        BodyPart defencedBodyPart = null;
//        hitCount = hitCount + 1;
//
//        if (hitCount == 1)
//        {
//        defencedBodyPart = BodyPart.HEAD;
//        } else if (hitCount == 2)
//        {
//        defencedBodyPart = BodyPart.ARM;
//        } else if (hitCount == 3)
//        {
//        hitCount = 0;
//        defencedBodyPart = BodyPart.LEG;
//        }
//        return defencedBodyPart;
//        }
//
//}
