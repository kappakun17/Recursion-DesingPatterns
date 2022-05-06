package rideexperience.attraction;

import rideexperience.area.Area;
import rideexperience.stateofaffairs.StateOfAffairs;

public interface Attraction {
    abstract public String description();// アトラクションに関する説明。

    abstract public String title();// アトラクションの名前。
    abstract public Area area();

    // アトラクション中のナレーション。最初から最後までのアトラクション全体を描写します。StateOfAffairsオブジェクトが渡され、
    //このオブジェクトによってアトラクションの雰囲気が変わります。RideExperienceはこのStateOfAffairsオブジェクトを作成し、
    //rideNarrationを呼び出す時に渡します。
    abstract public String rideNarration(StateOfAffairs stateOfAffairs);
    abstract public String toString();

    abstract public double kidFriendliness(); // 子供にとってのアトラクションの満足度。
    abstract public double teenFriendliness(); // 10代（ティーンエイジャー）にとってのアトラクションの満足度。
    abstract public double adultFriendliness(); // 大人にとってのアトラクションの満足度。
    abstract public double scarriness(); // アトラクションの恐怖度。
    abstract public double thrill(); // アトラクションのスリル度。
    abstract public double laughter(); // アトラクションの面白度。
    abstract public double sightseeing(); // アトラクションの観賞度。
    abstract public double comfortableness(); // アトラクションの快適度。

    abstract public double averageSpeedM();// アトラクションの平均速度(m/s)。
    abstract public double maximumSpeed();// アトラクションの最大速度
    abstract public double maximumWeight();// アトラクションがサポートする最大の体重。
    abstract public double mimimumHeight();// アトラクションがサポートする最小の身長。
    abstract public double maximumHeight();// アトラクションがサポートする最大の身長。
    abstract public String warnings();// アトラクションが文字列として出力する警告。健康状態、発作、閉所恐怖症、妊娠、首のトラブルのような警告が含まれます。

    
}