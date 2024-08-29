import { NavigationMenu } from "./header-menu/navigation-menu"
import { NavigationPanel } from "./header-menu/navigation-panel"


export const Header = () => {
    return (
        <div>
            <NavigationPanel />
            <NavigationMenu />
        </div>
    )
}