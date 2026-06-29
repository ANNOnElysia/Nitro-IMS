# Nitro IMS

This project is a rebranded, ad-free version based on the original repository [ryfineZ/carrier-ims-for-pixel](https://github.com/ryfineZ/carrier-ims-for-pixel). 

## Modifications

* **Application ID and Package Identity**: The built application identity (applicationId) has been updated to `com.anno.nims` to allow coexistence with the original app, while preserving the internal codebase namespace structure for maximum stability.
* **Ad Removal**: Fully bypassed standard pop-up/splash ads by overriding the internal ad-free and commercial ad logic to return success with empty configurations.
* **Interface Cleanup**: The dedicated Cooperation (AD) tab has been completely removed from the bottom navigation bar alongside its respective page rendering and asset references.
* **Rebranding**: The application name has been changed from "Carrier IMS" to "Nitro IMS" across all application titles, system components, APN references, and localization string resources (`strings.xml`).
* **Version Management**: The initial baseline version for this modified release is locked at `1.0.0`.

## Important Notes

* **Permissions**: Because the package identity (`applicationId`) has been changed, you will need to manually re-grant any root-level or framework-level access (such as Shizuku or wireless debugging permissions) that you previously authorized for the original version.
* **License Compliance**: This software is modified and redistributed in compliance with the Apache-2.0 License. All original copyrights and credits belong to the original upstream authors.
