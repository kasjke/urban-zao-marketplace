import { NavigationUser } from "../../shared/header-menu/navigation-user";
import { NavigationSearch } from "../../shared/header-menu/navigation-search";
import { NavigationMenu } from "../../shared/header-menu/navigation-menu";
import { HeaderInfo } from "./header-info";

export const MainPage = () => {
    return (
        <div>
            <NavigationSearch />
            <NavigationUser />
            <NavigationMenu />
            <HeaderInfo />
        </div>
    )
}