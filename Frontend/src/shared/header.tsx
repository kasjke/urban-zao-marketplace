import { NavigationMenu } from "./header-menu/navigation-menu"
import { NavigationSearch } from "./header-menu/navigation-search"
import { NavigationUser } from "./header-menu/navigation-user"


export const Header = () => {
    return (
        <div>
            <NavigationSearch />
            <NavigationUser />
            <NavigationMenu />
        </div>
    )
}